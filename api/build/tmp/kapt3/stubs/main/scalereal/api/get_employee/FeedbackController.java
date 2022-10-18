package scalereal.api.get_employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lscalereal/api/get_employee/FeedbackController;", "", "get", "Lscalereal/api/common/Response;", "srNo", "", "getByEmpId", "empId", "", "getByFirstName", "firstName", "api"})
public abstract interface FeedbackController {
    
    @org.jetbrains.annotations.NotNull()
    public abstract scalereal.api.common.Response<java.lang.Object> get(long srNo);
    
    @org.jetbrains.annotations.NotNull()
    public abstract scalereal.api.common.Response<java.lang.Object> getByEmpId(@org.jetbrains.annotations.NotNull()
    java.lang.String empId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract scalereal.api.common.Response<java.lang.Object> getByFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName);
}