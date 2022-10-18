package scalereal.core.get_employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lscalereal/core/get_employee/FeedbackRepository;", "", "finBy", "Lscalereal/core/models/domain/Employee;", "firstName", "", "finByEmpId", "empId", "finById", "srNo", "", "core"})
public abstract interface FeedbackRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.domain.Employee finBy(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.domain.Employee finByEmpId(@org.jetbrains.annotations.NotNull()
    java.lang.String empId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.domain.Employee finById(long srNo);
}