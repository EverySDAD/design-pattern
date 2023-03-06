import log.Logger;
import log.SingletonLogger;

import java.util.Scanner;

public class Singleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 1번과 2번은 설정한대로 글자색이 작동안하고 간간히 엉켜있지만
         * 싱글톤으로 구현한 3번은 원하는대로 글자색이 구분되어 잘 되고있다.
         */
        System.out.println("1. Non Singleton - static");
        System.out.println("2. Non Singleton - new 객체");
        System.out.println("3. Singleton");
        int inputInt = sc.nextInt();
        Singleton testSingleton = new Singleton();
        if (inputInt == 1) {
            testSingleton.nonSingle();
        } else if (inputInt == 2) {
            testSingleton.newNonSingle();
        } else if (inputInt == 3) {
            testSingleton.single();
        }
    }


    void newNonSingle() {
        Logger logger = new Logger();
        Thread thread1 = new Thread(() -> {
            logger.setLogColor("\u001B[31m");
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 1 ]");
            for (int i = 0; i < 100; i++) {
                logger.log(currentThread.getName() + "nonSingleton Thread - 1");
            }
        });

        Thread thread2 = new Thread(() -> {
            logger.setLogColor("\u001B[34m");
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 2 ]");
            for (int i = 0; i < 100; i++) {
                logger.log(currentThread.getName() + "nonSingleton Thread - 2");
            }
        });

        Thread thread3 = new Thread(() -> {
            logger.setLogColor("\u001B[33m");
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 3 ]");
            for (int i = 0; i < 100; i++) {
                logger.log(currentThread.getName() + "nonSingleton Thread - 3");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * 싱글스레드로 하지 않았을때 static을 사용해도, 사용하지않고 객새를 생성해서 사용해도 서로 엉켜서 로그가 꼬인다.
     * -> 간간히 색상이 잘못입혀진다.
     */
    void nonSingle() {
        Thread thread1 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 1 ]");
            for (int i = 0; i < 100; i++) {
                Logger.setStaticLogColor("\u001B[31m");
                Logger.staticLog(currentThread.getName() + "nonSingleton Thread - 1");
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 2 ]");
            for (int i = 0; i < 100; i++) {
                Logger.setStaticLogColor("\u001B[34m");
                Logger.staticLog(currentThread.getName() + "nonSingleton Thread - 2");
            }
        });

        Thread thread3 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 3 ]");
            for (int i = 0; i < 100; i++) {
                Logger.setStaticLogColor("\u001B[33m");
                Logger.staticLog(currentThread.getName() + "nonSingleton Thread - 3");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * 싱글 쓰레드를 사용하면 로그가 꼬이지않는다.
     */
    void single() {
        Thread thread1 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 1 ]");
            for (int i = 0; i < 100; i++) {
                SingletonLogger.ERROR.log(currentThread.getName() + "Singleton thread - 1");
            }
        });
        Thread thread2 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 2 ]");
            for (int i = 0; i < 100; i++) {
                SingletonLogger.INFO.log(currentThread.getName() + "Singleton thread - 2");
            }
        });
        Thread thread3 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("thread 3 ]");
            for (int i = 0; i < 100; i++) {
                SingletonLogger.WARNING.log(currentThread.getName() + "Singleton thread - 3");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

