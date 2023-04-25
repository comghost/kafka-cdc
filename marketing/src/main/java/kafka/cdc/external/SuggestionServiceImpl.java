package kafka.cdc.external;

import org.springframework.stereotype.Service;

@Service
public class SuggestionServiceImpl implements SuggestionService {

    /**
     * Fallback
     */
    public Suggestion getSuggestion(Long id) {
        Suggestion suggestion = new Suggestion();
        return suggestion;
    }
}
