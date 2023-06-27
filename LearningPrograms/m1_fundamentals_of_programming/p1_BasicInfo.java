class p1_BasicInfo
{
    public static void main(String[] args)
    {
        // HighLevelLanguage >> Compiler >> MachineLevelLanguage >> Processor >> Output

        // Platform >> (OS + Processor) but usually, Platform refers to OS.

        // Platform Dependency
        // file.cpp (C++ file) >> file.exe (compiled on windoes)
        // file.exe will only execute on the same platform (windoes) and not on other platform
        // like Mac, Linux etc.

        // Note - You can't share your high level original source code
        // through network (safety issues)

        // How Java is platform independent ?
        // file.java >> Java Compiler >> file.class >> JVM >> MLL >> Processor >> Output
        // file.class is byte code which can be transported over the network and is very secure.
        // Due to byte code, java is platform independent...
        // JVM is platform dependent software.
    }
}