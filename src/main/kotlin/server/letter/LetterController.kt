package server.letter

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDate


@Controller
class LetterController {
    @GetMapping("/letter")
    fun showLetter(model: Model): String {

        return "letter"
    }
}