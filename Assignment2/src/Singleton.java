class Singleton
{
    private static Singleton instance = null;

    public String singleton;

    private Singleton()
    {
        singleton = "Hello , This is a Singleton class";
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}



