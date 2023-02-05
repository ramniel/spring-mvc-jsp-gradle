package tech.harkos;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import tech.harkos.config.SpringWebConfig;

public class DispatchServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
