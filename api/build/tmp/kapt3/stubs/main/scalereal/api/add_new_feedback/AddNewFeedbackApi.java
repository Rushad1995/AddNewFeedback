package scalereal.api.add_new_feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lscalereal/api/add_new_feedback/AddNewFeedbackApi;", "", "addNewFeedbackController", "Lscalereal/api/add_new_feedback/AddNewFeedbackController;", "(Lscalereal/api/add_new_feedback/AddNewFeedbackController;)V", "post", "Lio/micronaut/http/HttpResponse;", "feedback", "", "feedbackTo", "feedbackFrom", "api"})
@io.micronaut.security.annotation.Secured(value = {"isAuthenticated()"})
@io.micronaut.http.annotation.Controller(value = "api/addnewfeedback")
public final class AddNewFeedbackApi {
    private final scalereal.api.add_new_feedback.AddNewFeedbackController addNewFeedbackController = null;
    
    public AddNewFeedbackApi(@org.jetbrains.annotations.NotNull()
    scalereal.api.add_new_feedback.AddNewFeedbackController addNewFeedbackController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> post(@org.jetbrains.annotations.NotNull()
    java.lang.String feedback, @org.jetbrains.annotations.NotNull()
    java.lang.String feedbackTo, @org.jetbrains.annotations.NotNull()
    java.lang.String feedbackFrom) {
        return null;
    }
}