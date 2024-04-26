package jebi.hendardi.Springwebmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import jebi.hendardi.Springwebmvc.model.Partner;

@Controller
public class PartnerController {

    @GetMapping("/partner/current")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String getPartner(Partner partner) {
        return partner.getId() + " : " + partner.getName();
    }
}

