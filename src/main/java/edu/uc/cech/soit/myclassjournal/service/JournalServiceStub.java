package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * A stub implementation of the {@link IJournalService} interface for managing journal entries.
 * This class provides basic CRUD (Create, Read, Update, Delete) operations for journal entries
 * by delegating the data access tasks to an injected {@link IJournalDAO} instance.
 *
 * <p>
 * This service class is marked as a Spring {@link Service} to enable Spring's component scanning and bean creation.
 * It utilizes constructor-based dependency injection to receive an {@link IJournalDAO} instance.
 * </p>
 *
 * @author Zach McIntosh
 * @version 1.0
 * @since 2023-09-24
 */
@Service
public class JournalServiceStub implements IJournalService{
    /** The data access object for managing journal entries. */
    @Autowired
    private IJournalDAO journalDAO;

    /**
     * Default constructor for the {@code JournalServiceStub} class.
     */
    public JournalServiceStub(){

    }

    /**
     * Constructor with an {@link IJournalDAO} parameter for dependency injection.
     *
     * @param journalDAO The data access object for managing journal entries.
     */
    public JournalServiceStub(IJournalDAO journalDAO){
        this.journalDAO = journalDAO;
    }
    /**
     * Saves a new journal entry or updates an existing one using the injected {@link IJournalDAO}.
     *
     * @param journalEntry The journal entry to save or update.
     * @return The saved or updated journal entry.
     */
    @Override
    public JournalEntry save(JournalEntry journalEntry){

        return journalDAO.save(journalEntry);
    }

    /**
     * Retrieves a list of all journal entries using the injected {@link IJournalDAO}.
     *
     * @return A list of journal entries.
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalDAO.fetchAll();
    }
}
