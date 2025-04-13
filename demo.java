public class demo{
    public static void main(String[] args) {
        int a[]=new int[]{10,20,30,40,50};
        int i,j,k;
        i=j=k=0;
        i+=1;
        a[i]=a[j]+10;
        a[++j]=a[i++];
        a[k++]=a[i+j>>2]+10;
        for(int x=0;x<a.length;x++){
            System.out.println(a[x]);
        }
        System.out.println(3<<2);

    }
}