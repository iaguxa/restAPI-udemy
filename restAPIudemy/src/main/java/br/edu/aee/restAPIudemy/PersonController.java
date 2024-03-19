package br.edu.aee.restAPIudemy;

import br.edu.aee.restAPIudemy.converters.NumberConverter;
import br.edu.aee.restAPIudemy.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PersonController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public Double sum (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Favor, informe um valor númerico!");
        }
        return (NumberConverter.convertToDouble(numberOne)) + (NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double sub (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Favor, informe um valor númerico!");
        }
        return (NumberConverter.convertToDouble(numberOne)) - (NumberConverter.convertToDouble(numberTwo));
    }

}
