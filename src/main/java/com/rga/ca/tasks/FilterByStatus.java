package com.rga.ca.tasks;

import com.rga.ca.ui.ComponentHeader;
import com.rga.ca.ui.SubComponentStatus;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static com.rga.ca.model.Status.Processing_ocr;
import static com.rga.ca.model.Status.Validating_ocr;

public class FilterByStatus implements Task {

    private Enum status;

    public FilterByStatus(Enum status) {
        this.status = status;
    }

    @Step("{0} filter by status #status")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Target StatusLink = null;

        if (this.status.equals(Processing_ocr)){
            StatusLink = SubComponentStatus.PROCESSING_OCR;

        } else if(this.status.equals(Validating_ocr)){
            StatusLink = SubComponentStatus.VALIDATING_OCR;

        } else {
            StatusLink = SubComponentStatus.COMPLETED;
        }

        actor.attemptsTo(
                Click.on(ComponentHeader.STATUS_FILTER),
                Click.on(StatusLink)
        );
    }

}
