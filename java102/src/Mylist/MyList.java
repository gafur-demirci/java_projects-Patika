package Mylist;

public class MyList<T>  {

    private T[] arr;
    private int counter=0;
    private int length;

    public MyList(int length) {
        this.length = length;
        arr= (T[]) new Object[length];

        System.out.println("arrayli ctor");
    }

    public MyList(){
        System.out.println("boş ctor");
        arr= (T[]) new Object[10];
    }

    public MyList(Integer capacity){
        System.out.println("capacityli ctor");
    }

    public void add(T elem){
        if (getLength() > getCounter()){

            T[] tempArr = getArr();
            tempArr[getCounter()] = elem;
            setArr(tempArr);
            setCounter(getCounter() + 1);

        }else{
            System.out.println("dizi dolu ");


//            length = getCounter();

        }
    }

    public int getCapacity(){
        int count = 0;
        for (T i : this.arr){
            if(i != null){
                count++;
            }
        }
        return count;
    }

    public void get(int index){

        if (index < getLength()){
            T[] tempArr = getArr();

            if(tempArr[index] != null){
                System.out.println(tempArr[index]);
            }else{
                System.out.println("burası boşluk :D ");
            }

        }else{
            System.out.println("index büyük");
        }
    }

    public int size(){
        if (length < 10){
            length = 10;
        }else if(length > 10){
            length *= 2;
        }
        return length;
    }


















    public T[] getArr() { return arr; }

    public void setArr(T[] arr) { this.arr = arr; }

    public int getCounter() { return counter; }

    public void setCounter(int counter) { this.counter = counter; }

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }
}
