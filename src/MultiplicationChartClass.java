class MultiplicationChartClass implements MultiplicationChartInterface {
    int n;

    MultiplicationChartClass(int s){
        n = s;
    }
    @Override
    public void displayChart() {
        System.out.print("\nX\t|");
        for(int i = 1; i <= n; i++){
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.print("----|-");
        for(int i = 0; i < n; i++){
            System.out.print("----");
        }
        for(int i = 1; i <= n; i++){
            System.out.print("\n" + i );
            System.out.print("\t|\t");
            for(int z = 1; z <= n; z++){
                System.out.print(z * i + "\t");
            }
        }
    }
}
