package net.corda.c5template.service;
import net.corda.v5.application.injection.CordaFlowInjectable;
import net.corda.v5.application.services.CordaService;

public interface CustomService extends CordaService, CordaFlowInjectable {
    public void fun();
}
