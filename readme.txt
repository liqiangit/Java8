源码下载地址
www.oraclepressbooks.com

Java完全参考手册（第8版）
https://book.2cto.com/201209/3819.html


Java NIO系列教程（八） SocketChannel
http://ifeve.com/socket-channel/
http://ifeve.com/overview/
http://ifeve.com/java-nio-vs-io/


https://www.liaoxuefeng.com/
Java的Fork/Join任务，你写对了吗？
https://www.liaoxuefeng.com/article/001493522711597674607c7f4f346628a76145477e2ff82000

protected Long compute() {
    if (任务足够小?) {
        return computeDirect();
    }
    // 任务太大,一分为二:
    SumTask subtask1 = new SumTask(...);
    SumTask subtask2 = new SumTask(...);
    // 分别对子任务调用fork():
    subtask1.fork();
    subtask2.fork();
    // 合并结果:
    Long subresult1 = subtask1.join();
    Long subresult2 = subtask2.join();
    return subresult1 + subresult2;
}
这个任务就分！错！了！
比如甲把400分成两个200后，这种写法相当于甲把一个200分给乙，把另一个200分给丙，然后，甲成了监工，不干活，等乙和丙干完了他直接汇报工作。乙和丙在把200分拆成两个100的过程中，他俩又成了监工，这样，本来只需要4个工人的活，现在需要7个工人才能1天内完成，其中有3个是不干活的。

其实，我们查看JDK的invokeAll()方法的源码就可以发现，invokeAll的N个任务中，其中N-1个任务会使用fork()交给其它线程执行，但是，它还会留一个任务自己执行，这样，就充分利用了线程池，保证没有空闲的不干活的线程。