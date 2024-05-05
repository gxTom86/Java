class Calcolatrice_02 {
    private double num1;
    private double num2;

    public double getNum1() 
        
    {    
         return num1;
    }

    
    public double getNum2() 
    {
        return num2;
    }

    public void setNum1(double num1) 
    {
        this.num1 = num1;
    }

    public void setNum2(double num2) 
    {
        this.num2 = num2;
    }

    public double sommaNum() 
    {
        return num1 + num2;
    }

    public double sottrazioneNum() 
    {
        return num1 - num2;
    }

    public double moltiplicazioneNum() 
    {
        return num1 * num2;
    }

    public double divisioneNum() 
    {
        if (num2 == 0) {
            System.out.println(" Stai dividendo x 0 ");
        }
        return num1 / num2;
    }
}