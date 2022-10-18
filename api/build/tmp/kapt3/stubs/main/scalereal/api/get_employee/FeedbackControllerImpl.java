package scalereal.api.get_employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lscalereal/api/get_employee/FeedbackControllerImpl;", "Lscalereal/api/get_employee/FeedbackController;", "feedbackService", "Lscalereal/core/get_employee/FeedbackService;", "(Lscalereal/core/get_employee/FeedbackService;)V", "get", "Lscalereal/api/common/Response;", "", "srNo", "", "getByEmpId", "empId", "", "getByFirstName", "firstName", "api"})
@jakarta.inject.Singleton()
public final class FeedbackControllerImpl implements scalereal.api.get_employee.FeedbackController {
    private final scalereal.core.get_employee.FeedbackService feedbackService = null;
    
    public FeedbackControllerImpl(@org.jetbrains.annotations.NotNull()
    scalereal.core.get_employee.FeedbackService feedbackService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public scalereal.api.common.Response<java.lang.Object> get(long srNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public scalereal.api.common.Response<java.lang.Object> getByEmpId(@org.jetbrains.annotations.NotNull()
    java.lang.String empId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public scalereal.api.common.Response<java.lang.Object> getByFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName) {
        return null;
    }
}