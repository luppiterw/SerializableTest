package test;

import javafx.util.Pair;
import models.Person;
import utils.ContainerUtil;
import utils.SerialUtil;

import java.util.Hashtable;
import java.util.List;

/**
 * Created by hughie on 2017/4/3.
 * For output test
 */
public final class Tester {
    public static final String testFileName = "testSerialFile.txt";

    public static void savePerson(Person person) {
        SerialUtil.saveObject(person, testFileName);
    }

    /**
     * {@link utils.ContainerUtil.SpaceHashTable}
     * */
    public static final class SpaceHashTable {
        /**
         * 测试SpaceHashTable中的方法耗时
         * */
        public static void printOnce() {
            printTimes(1);
        }
        /**
         * 打印多次测试耗时
         * */
        @SuppressWarnings("unchecked")
        public static void printTimes(int times) {
            long setTypeStartTime1 = System.currentTimeMillis();
            int tmpTimes = times;
            while(tmpTimes-- > 0) {
                List<Pair> propertyPairList = ContainerUtil.SpaceHashTable.getHashTableListByEnumerationMode(
                        (Hashtable) System.getProperties());
            }
            System.out.println("[ContainerUtil.SpaceHashTable.getHashTableListByEnumerationMode] 耗时 " +
                    (System.currentTimeMillis() - setTypeStartTime1) + "ms");


            long setTypeStartTime2 = System.currentTimeMillis();
            tmpTimes = times;
            while (tmpTimes-- > 0) {
                List<Pair> propertyPairList2 = ContainerUtil.SpaceHashTable.getHashTableListByIteratorMode(
                        (Hashtable) System.getProperties());
            }
            System.out.println("[ContainerUtil.SpaceHashTable.getHashTableListByIteratorMode] 耗时 " +
                    (System.currentTimeMillis() - setTypeStartTime2) + "ms");

            long setTypeStartTime3 = System.currentTimeMillis();
            tmpTimes = times;
            while (tmpTimes-- > 0) {
                List<Pair> propertyPairList3 = ContainerUtil.SpaceHashTable.getHashTableListByMapEntryMode(
                        (Hashtable) System.getProperties());
            }
            System.out.println("[ContainerUtil.SpaceHashTable.getHashTableListByMapEntryMode] 耗时 " +
                    (System.currentTimeMillis() - setTypeStartTime3) + "ms");
        }
    }
}
