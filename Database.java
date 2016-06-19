package AtmSoftware;

public class Database 
{
    static String[][] dataCollection;
    static byte n,currentCustomer;
    static 
    {
        dataCollection=new String[10][4];
        n=0;
    }
    static boolean storeDetails(String name,String account,String pin,String balance)
    {
        if(n<=10)
        {
            dataCollection[n][0]=name.toLowerCase();
            dataCollection[n][1]=account;
            dataCollection[n][2]=pin;
            dataCollection[n][3]=balance;
            n++;
            return true;
        }
        return false;
    }
    static boolean checkDetails(String name,String account)
    {
        for(byte i=0;i<n;i++)
        {
            if(dataCollection[i][0].equals(name.toLowerCase())&&dataCollection[i][1].equals(account))
            {
                currentCustomer=i;
                return true;
            }
        }
        return false;
    }
    static boolean checkPin(String pin)
    {
        return dataCollection[currentCustomer][2].equals(pin);
    }
    
}
