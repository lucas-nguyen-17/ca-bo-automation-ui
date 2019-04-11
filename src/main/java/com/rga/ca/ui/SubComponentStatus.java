package com.rga.ca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SubComponentStatus {

    public static final Target PROCESSING_OCR = Target.the("status 'PROCESSING_OCR'")
            .locatedBy("//span[contains(text(),'Processing OCR')]");

    public static final Target VALIDATING_OCR = Target.the("status 'VALIDATING_OCR'")
            .locatedBy("//span[contains(text(),'Validating OCR')]");;

    public static final Target COMPLETED = Target.the("status 'COMPLETED'")
            .locatedBy("//span[contains(text(),'Completed')]");;
}
