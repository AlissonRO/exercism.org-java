import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        
        List<Signal> signals = new ArrayList<>();
        Signal[] allSignals = {Signal.WINK, Signal.DOUBLE_BLINK, Signal.CLOSE_YOUR_EYES, Signal.JUMP};
        
        for(int i = 0 ; i < allSignals.length; i++){
            if((number & (1 << i)) != 0){
                signals.add(allSignals[i]);
            }
        }
        
        if((number & (1 << 4)) != 0){
            Collections.reverse(signals);
        }
        
        return signals;
    }
}