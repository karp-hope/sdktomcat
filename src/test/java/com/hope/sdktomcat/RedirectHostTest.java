package com.hope.sdktomcat;

import com.hope.sdktomcat.RedirectHost;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: com.hope.sdktomcat.RedirectHostTest
 * *
 * @author: hope
 * *
 * @create: 2019-03-14 09:21
 */
public class RedirectHostTest {

    @Test
    public void testRedirectGet() throws Exception{
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        Mockito.when(request.getMethod()).thenReturn("GET");

        RedirectHost redirectHost = new RedirectHost();
        redirectHost.doGet(request, null);
    }
}
