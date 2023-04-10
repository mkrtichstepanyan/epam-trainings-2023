package homework_9.garik_gharibyan.assignment.validatia;

import homework_9.garik_gharibyan.assignment.annotations.birthday_annotation.AdulthoodAnnotationProcessor;
import homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation.DiscountRageAnnotationProcessor;
import homework_9.garik_gharibyan.assignment.annotations.email_annotation.EmailAnnotationProcessor;
import homework_9.garik_gharibyan.assignment.annotations.name_annotatuion.NameAnnotationProcessor;
import homework_9.garik_gharibyan.assignment.error.Error;
import homework_9.garik_gharibyan.assignment.error.Errors;

public class CustomerValidator implements Validator{

    private final Errors errors = new Errors();
    @Override
    public Errors validate(Object customerDto) throws IllegalAccessException {
        Error errorName = NameAnnotationProcessor.processAnnotation(customerDto);
        errors.addError(errorName);
        Error errorEmail = EmailAnnotationProcessor.processAnnotation(customerDto);
        errors.addError(errorEmail);
        Error errorDiscountRage = DiscountRageAnnotationProcessor.processAnnotation(customerDto);
        errors.addError(errorDiscountRage);
        Error errorAdulthood = AdulthoodAnnotationProcessor.processAnnotation(customerDto);
        errors.addError(errorAdulthood);
        return errors;
    }

}
