public class Sort <T extends Number>{
    T n,a[];
    Sort(T n,T a[]){
        this.n = n;
        this.a = a;
    }
    void sort(){
        for(int i=0;i<n.intValue();i++){
            for(int j=0;j<n.intValue()-i-1;j++){
                if(a[j].doubleValue()>a[j+1].doubleValue()){
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    void print(){
        for(int i=0;i<n.intValue();i++){
            System.out.print(a[i]+" ");
        }
    }
}
