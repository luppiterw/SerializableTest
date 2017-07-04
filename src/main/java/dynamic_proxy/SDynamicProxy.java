package dynamic_proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by hughie on 17-7-4.
 * My proxy class
 */
public class SDynamicProxy {

    public static Object newProxyInstance(Class<SDynamicSubjectIml> subjectInterface, SDynamicInvocationHandlerIml h)throws Exception {
        Object obj = null;
        String br = "\r\n"; //换行的转义符

        //得到抽象接口里面所有的方法数组
        Method[] ms = subjectInterface.getMethods();

        //存储用反射制造出来的抽象接口里面的方法
        String methodString = "";

        for (Method m : ms) {
            //如果要代理的接口有多个方法，要把下面的 "methodString=" 改成 "methodString+="
            methodString =
                    "  public void  " + m.getName() + "(){" + br +
                            "     try{ " + br +
                            //不可以去掉这句
                            "      Method md=" + subjectInterface.getSimpleName() + ".class.getMethod(\"" +
                            m.getName() + "\");" + br +
                            "       h.invoke(this,md);" + br +
                            "       }catch (Exception e){ " + br +
                            "           e.printStackTrace();" + br +
                            "       }" + br +
                            "   }";
        }
        String src="package dynamic_proxy;"+br+
                "import java.lang.reflect.Method;"+br+
                "public class $Proxy implements "+subjectInterface.getSimpleName()+"{"+br+
                " private dynamic_proxy.SDynamicInvocationHandlerIml h;"+br+
                "   public $Proxy(SDynamicInvocationHandlerIml h) {" + br +
                "       super();" + br +
                "       this.h = h;" + br +
                "   }" + br + br +
                methodString+br+
                "}";

        //生成java文件
//        String fileName= "F:\\G\\servlet\\Design\\dynamicProxy\\$Proxy.java";
        String fileName= "src/main/java/dynamic_proxy/$Proxy.java";

        File file = new File(fileName);
        FileWriter fWriter = new FileWriter(file);
        fWriter.write(src);
        fWriter.flush();
        fWriter.close();


        // jdk6提供的工具类，用来生成class文件。
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        Iterable units = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);

        task.call();
        fileManager.close();
        //生成代理类的类对象
//        Class c=Class.forName("dynamic_proxy.$SDynamicProxy");
        Class c = Class.forName("dynamic_proxy.$Proxy");

        Constructor ctr=c.getConstructor(SDynamicInvocationHandlerIml.class);
        //生成代理类的实例，传进处理器对象，用于给代理类调用invoke()方法
        obj=(Object) ctr.newInstance(h);
        return obj;  //返回代理类实例
    }
}
