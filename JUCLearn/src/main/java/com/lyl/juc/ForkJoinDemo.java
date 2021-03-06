package com.lyl.juc;

import java.util.concurrent.*;

class MyTask extends RecursiveTask<Integer> {
    private static final Integer ADJUST_VALUE=10;
    private int begin;
    private int end;
    private int result;

    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if ((end-begin)<=ADJUST_VALUE){
            for (int i = begin; i <=end ; i++) {
                result+=i;
            }
        }else {
            int middle=(begin+end)/2;
            MyTask myTask1=new MyTask(begin,middle);
            MyTask myTask2=new MyTask(middle+1,end);
            myTask1.fork();//分支
            myTask2.fork();//分支
            result=myTask1.join()+myTask2.join();
        }
        return result;
    }
}
public class ForkJoinDemo {
    /**
     * 分支合并框架
     * ForkJoinPool
     * ForkJoinTask
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyTask myTask=new MyTask(0,100);
        ForkJoinPool threadPool=new ForkJoinPool();
        ForkJoinTask<Integer> forkJoinTask = threadPool.submit(myTask);
        System.out.println(forkJoinTask.get());
        threadPool.shutdown();
    }
}
