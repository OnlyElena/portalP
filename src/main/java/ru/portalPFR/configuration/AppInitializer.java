package ru.portalPFR.configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Created by 048ChubakovaEL on 15.08.2016.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
