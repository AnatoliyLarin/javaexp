package training.patterns.abstractfactory.interfaces;

public class SoftBreak implements Break {

    @Override
    public String stop(){
        String autoPartName = "Soft Break";
        return autoPartName;
    }
}
