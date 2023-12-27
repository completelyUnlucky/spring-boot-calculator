package com.calculator.service;

import com.calculator.model.AppModel;
import org.springframework.stereotype.Service;

@Service
public class Operations {
    public Float plus(AppModel appModel) {
        try {
            return appModel.getFirstNum()  + appModel.getSecondNum();
        } catch (NullPointerException exception) {
            return 0f;
        }
    }
    public Float subtraction(AppModel appModel) {
        try {
            return appModel.getFirstNum() - appModel.getSecondNum();
        } catch (NullPointerException exception) {
            return 0f;
        }
    }
    public Float multiply(AppModel appModel) {
        try {
            return appModel.getFirstNum() * appModel.getSecondNum();
        } catch (NullPointerException exception) {
            return 0f;
        }
    }
    public Object divide(AppModel appModel) {
        try {
            if (appModel.getSecondNum() != 0) {
                return appModel.getFirstNum() / appModel.getSecondNum();
            }
        } catch (NullPointerException exception) {
            return 0f;
        }
        return "Division by zero!!!";
    }
}
