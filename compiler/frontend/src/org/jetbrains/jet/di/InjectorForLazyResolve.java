/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.lazy.ResolveSession;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.ModuleConfiguration;
import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.lazy.ScopeProvider;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.QualifiedExpressionResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.resolve.calls.OverloadingConflictResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.di.AllInjectorsGenerator. DO NOT EDIT! */
public class InjectorForLazyResolve {

    private final Project project;
    private final ResolveSession resolveSession;
    private final BindingTrace bindingTrace;
    private final ModuleConfiguration moduleConfiguration;
    private DescriptorResolver descriptorResolver;
    private ExpressionTypingServices expressionTypingServices;
    private TypeResolver typeResolver;
    private ScopeProvider scopeProvider;
    private AnnotationResolver annotationResolver;
    private QualifiedExpressionResolver qualifiedExpressionResolver;
    private CallResolver callResolver;
    private OverloadingConflictResolver overloadingConflictResolver;

    public InjectorForLazyResolve(
        @NotNull Project project,
        @NotNull ResolveSession resolveSession,
        @NotNull BindingTrace bindingTrace,
        @NotNull ModuleConfiguration moduleConfiguration
    ) {
        this.project = project;
        this.resolveSession = resolveSession;
        this.bindingTrace = bindingTrace;
        this.moduleConfiguration = moduleConfiguration;
        this.descriptorResolver = new DescriptorResolver();
        this.expressionTypingServices = new ExpressionTypingServices();
        this.typeResolver = new TypeResolver();
        this.scopeProvider = new ScopeProvider(resolveSession);
        this.annotationResolver = new AnnotationResolver();
        this.qualifiedExpressionResolver = new QualifiedExpressionResolver();
        this.callResolver = new CallResolver();
        this.overloadingConflictResolver = new OverloadingConflictResolver();

        this.descriptorResolver.setAnnotationResolver(annotationResolver);
        this.descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        this.descriptorResolver.setTypeResolver(typeResolver);

        this.expressionTypingServices.setCallResolver(callResolver);
        this.expressionTypingServices.setDescriptorResolver(descriptorResolver);
        this.expressionTypingServices.setProject(project);
        this.expressionTypingServices.setTypeResolver(typeResolver);

        this.typeResolver.setAnnotationResolver(annotationResolver);
        this.typeResolver.setDescriptorResolver(descriptorResolver);
        this.typeResolver.setModuleConfiguration(moduleConfiguration);
        this.typeResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);

        this.annotationResolver.setCallResolver(callResolver);
        this.annotationResolver.setExpressionTypingServices(expressionTypingServices);

        callResolver.setDescriptorResolver(descriptorResolver);
        callResolver.setExpressionTypingServices(expressionTypingServices);
        callResolver.setOverloadingConflictResolver(overloadingConflictResolver);
        callResolver.setTypeResolver(typeResolver);

    }

    @PreDestroy
    public void destroy() {
    }

    public DescriptorResolver getDescriptorResolver() {
        return this.descriptorResolver;
    }

    public ExpressionTypingServices getExpressionTypingServices() {
        return this.expressionTypingServices;
    }

    public TypeResolver getTypeResolver() {
        return this.typeResolver;
    }

    public ScopeProvider getScopeProvider() {
        return this.scopeProvider;
    }

    public AnnotationResolver getAnnotationResolver() {
        return this.annotationResolver;
    }

    public QualifiedExpressionResolver getQualifiedExpressionResolver() {
        return this.qualifiedExpressionResolver;
    }

}
