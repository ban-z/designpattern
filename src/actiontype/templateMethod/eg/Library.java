package actiontype.templateMethod.eg;

// 程序库开发人员
public class Library {

    /*
    * 稳定：template method
    * */
    public void step1(){

    }

    public void step3(){

    }

    public void step5(){

    }

    public void run(){
        step1();
        if (step2()){
            step3();
        }
        for (int i = 0; i < 4; i++){
            step4();
        }
        step5();
    }

    /*
    * 另外一种做法，Lib加入App的2，4，但不做实现
    * */
    // 变化
    public boolean step2(){
        return true;
    }

    // 变化
    public boolean step4(){
        return true;
    }
}
