class Demo{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a++%2==0){
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}