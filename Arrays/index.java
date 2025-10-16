public class index {
	public static void main(String[] args) {
    int a[] = {1,4,6,6,6,6,6,6,6,6,6,9,9,10,11};
    int s = 0;
    int l = a.length;
    int len = a.length;
    int t = 6;
    int t1 = 0;
    int t2 = 0;
    while(s<l)
        {
            int m = (s+l)/2;
            if(a[m]==t)
            {
                    t1 = m;
                    t2 = m;
                    while(t1>0)
                        {
                            if(a[m] == a[t1])
                            {
                                t1--;
                            }else
                                break;
                        } 
                        while(len>t2)
                        {
                            if(a[m] == a[t2])
                                {
                                    t2++;
                                }
                                else
                                    break;
                        } 
                    break;
            }
            else if(t<a[m])
                    {
                        l = m-1;
                    }
                    else
                    {
                        s = m+1;
                    }
                    }
                System.out.println(++t1+" "+--t2);
        }
}