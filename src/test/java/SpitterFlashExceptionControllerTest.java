import com.spittr.config.ScanConfig;
import com.spittr.controller.SpitterFlashExceptionController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author dongmei.gao
 * @date 2019/5/31 14:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScanConfig.class)
public class SpitterFlashExceptionControllerTest {
    @Autowired
    private SpitterFlashExceptionController spitterFlashExceptionController;

    @Test
    public void testShowRegisterForm() throws Exception{

        MockMvc mockMvc = standaloneSetup(spitterFlashExceptionController).build() ;
        //status()和 HttpStatus.NOT_FOUND抛出的异常是可以对应的
        mockMvc.perform(get("/flash/show")).andExpect(status().isNotFound());
    }
}
