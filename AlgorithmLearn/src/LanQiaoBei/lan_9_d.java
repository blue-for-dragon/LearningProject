package LanQiaoBei;

public class lan_9_d {
    /**
     * 测试次数
     * x星球的居民脾气不太好，但好在他们生气的时候唯一的异常举动是：摔手机。
     * 各大厂商也就纷纷推出各种耐摔型手机。x星球的质监局规定了手机必须经过耐摔测试，并且评定出一个耐摔指数来，之后才允许上市流通。
     * x星球有很多高耸入云的高塔，刚好可以用来做耐摔测试。塔的每一层高度都是一样的，
     * 与地球上稍有不同的是，他们的第一层不是地面，而是相当于我们的2楼。
     * 如果手机从第7层扔下去没摔坏，但第8层摔坏了，则手机耐摔指数=7。
     * 特别地，如果手机从第1层扔下去就坏了，则耐摔指数=0。
     * 如果到了塔的最高层第n层扔没摔坏，则耐摔指数=n
     * 为了减少测试次数，从每个厂家抽样3部手机参加测试。
     * 某次测试的塔高为1000层，如果我们总是采用最佳策略，在最坏的运气下最多需要测试多少次才能确定手机的耐摔指数呢？
     * 请填写这个最多测试次数。
     *
     */
    //假设k部手机 n层
    public static int dp(int[][] memory,int k,int n){
        if (k==1||n==0)
            return n;
        if (memory[k][n]!=0)
            return memory[k][n];
        int min=n;//最多需要n次
        for (int i=1;i<=n;i++){
            int temp=Math.max(dp(memory,k-1,i-1),dp(memory,k,n-i))+1;
            min=Math.min(min,temp);
        }
        memory[k][n]=min;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getTime(3, 1000));
    }
    public static int getTime(int k,int n){
        int[][] memory=new int[k+1][n+1];
        return dp(memory,k,n);
    }
}