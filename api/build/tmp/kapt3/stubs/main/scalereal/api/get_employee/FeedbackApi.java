package scalereal.api.get_employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lscalereal/api/get_employee/FeedbackApi;", "", "feedbackController", "Lscalereal/api/get_employee/FeedbackController;", "(Lscalereal/api/get_employee/FeedbackController;)V", "get", "Lio/micronaut/http/HttpResponse;", "srNo", "", "getByEmpId", "empId", "", "getByFirstName", "firstName", "api"})
@io.micronaut.security.annotation.Secured(value = {"isAuthenticated()"})
@io.micronaut.http.annotation.Controller(value = "api/employees")
public final class FeedbackApi {
    private final scalereal.api.get_employee.FeedbackController feedbackController = null;
    
    public FeedbackApi(@org.jetbrains.annotations.NotNull()
    scalereal.api.get_employee.FeedbackController feedbackController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{srNo}")
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> get(long srNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/empId/{empId}")
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> getByEmpId(@org.jetbrains.annotations.NotNull()
    java.lang.String empId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/firstName/{firstName}")
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> getByFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName) {
        return null;
    }
}