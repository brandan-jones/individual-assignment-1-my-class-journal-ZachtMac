package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controller class for managing journal entries in the Spring Boot application.
 * This class handles HTTP requests related to journal entries.
 *
 * @author Zach McIntosh
 * @version 1.0
 * @since 2023-09-24
 */
@Controller
public class MyClassJournalController {

    @Autowired
    IJournalService journalService;
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index(Model model) {

        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setJournalId(10);
        journalEntry.setDate("Today");
        journalEntry.setNotes("This is my first journal entry. Today I did the individual assignment.");


        model.addAttribute("journalEntry", journalEntry);

        return "index";
    }

    /**
     * Handle the /saveJournalEntry endpoint to save a new journal entry.
     *
     * @param journalEntry The journal entry to be saved.
     * @return The view name for rendering after saving the journal entry.
     */
    @RequestMapping("/saveJournalEntry")
    public String saveJournalEntry(JournalEntry journalEntry) {
        journalService.save(journalEntry);
        return "index.html";
    }

    /**
     * Handle the /journal endpoint to fetch all journal entries.
     *
     * @return A list of journal entries in JSON format.
     */
    @GetMapping("/journal")
    @ResponseBody
    public List<JournalEntry> fetchAllJournalEntries() {
        return journalService.fetchAll();
    }

    /**
     * Handle the /journalEntry endpoint to create a new journal entry.
     *
     * @param journalEntry The journal entry data provided in the request body.
     * @return The created journal entry in JSON format.
     */
    @PostMapping(value="/journalEntry", consumes="application/json", produces="application/json")
    public JournalEntry createJournalEntry(@RequestBody JournalEntry journalEntry){
        JournalEntry newJournalEntry = null;
        try {
            newJournalEntry = journalService.save(journalEntry);
        } catch (Exception e){
            //Do later
        }

        return newJournalEntry;
    }


}
