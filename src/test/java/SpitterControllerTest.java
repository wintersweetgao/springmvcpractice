import com.spittr.config.ScanConfig;
import com.spittr.controller.SpitterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author dongmei.gao
 * @date 2019/5/29 10:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScanConfig.class)
public class SpitterControllerTest {
    @Autowired
    private SpitterController spitterController;

    @Test
    public void testShowRegisterForm() throws Exception{

        MockMvc mockMvc = standaloneSetup(spitterController).build() ;
        mockMvc.perform(get("/spi/register")).andExpect(view().name("form/registerForm"));
    }

    @Test
    public void testprocessRegister() throws Exception{

        MockMvc mockMvc = standaloneSetup(spitterController).build() ;
        mockMvc.perform(get("/spi/register")).andExpect(view().name("form/registerForm"));
        mockMvc.perform(post("/spi/register")
               .param("fistName","gao")
               .param("lastName","dongmei")
                .param("passWord","sss")).andExpect(redirectedUrl("/spi/gao"));
    }
}
