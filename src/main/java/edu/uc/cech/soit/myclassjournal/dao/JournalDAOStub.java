package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * A stub implementation of the {@link IJournalDAO} interface for managing journal entries.
 * This class is used for testing and provides an in-memory storage mechanism for journal entries.
 *
 * <p>
 * This stub DAO stores journal entries in an internal list, allowing for basic CRUD (Create, Read, Update, Delete) operations.
 * It is marked as a Spring {@link Repository} to enable Spring's component scanning and bean creation.
 * </p>
 *
 * @author Zach McIntosh
 * @version 1.0
 * @since 2023-09-24
 */
@Repository
public class JournalDAOStub implements IJournalDAO{
    //Internal storage for journal entries
    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();

    /**
     * Saves a new journal entry or updates an existing one in the internal storage.
     *
     * @param journalEntry The journal entry to save or update.
     * @return The saved or updated journal entry.
     */
    @Override
    public JournalEntry save(JournalEntry journalEntry){
        allJournalEntries.add(journalEntry);
        return journalEntry;
    }

    /**
     * Retrieves a list of all journal entries from the internal storage.
     *
     * @return A list of journal entries.
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}
