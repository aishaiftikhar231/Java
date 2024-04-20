/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcarddemo2;

/**
 *
 * @author hp
 */
public class Money {
    private long dollars;
    private long cents;
    
    public Money(double amount)
    {
        if(amount<0)
        {
            System.out.println("error negative amount");
            System.exit(0);
        }
        else
        {
            long allcents=Math.round(amount*100);
            dollars=allcents/100;
            cents=allcents%100;
        }
    }
    
    public Money(Money obj)
    {
       this.dollars= obj.dollars;
       this.cents= obj.cents;
        
    }
    public Money add(Money otheramount)
    {
        Money sum=new Money(otheramount);
        sum.cents=this.cents+otheramount.cents;
        long carrydollars=sum.cents/100;
        sum.cents=sum.cents%100;
        sum.dollars=this.dollars+otheramount.dollars+carrydollars;
        
        return sum;
    }
    public String toString()
    {
        
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
    
    
    public Money subtract(Money amount)
    {
        Money diff=new Money(0);
        if(this.cents<amount.cents)
        {
            this.dollars=this.dollars-1;
            this.cents=this.cents+100;
        }
        diff.dollars=this.dollars=amount.dollars;
        diff.cents=this.cents-amount.cents;
        
        return diff;
    }
    public int compareTo(Money amount)
{
    int value;
    if(this.dollars<amount.dollars)
        value=-1;
    else if(this.dollars>amount.dollars)
        value=1;
    else if(this.cents<amount.cents)
        value=-1;
    else if(this.cents>amount.cents)
        value=1;
    else
        value=0;
    return value;
    


}
      public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }

        return false;
    }

}
