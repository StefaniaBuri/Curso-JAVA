package local.concept2_view_controller;

import local.exceptions.BusinessException;

public class CalcApp {

    public static void main(String[] args) throws BusinessException {
        System.out.println("Calculadora");
        CalcController controller = new CalcController();
        CalcView view = new CalcView(controller);
        System.out.println(view);
        System.out.println(controller);

        view.askContinue();
    }
}
