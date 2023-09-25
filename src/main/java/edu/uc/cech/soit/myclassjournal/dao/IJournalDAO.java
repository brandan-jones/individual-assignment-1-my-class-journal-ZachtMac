package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

/**
 * This interface defines the contract for interacting with the data access layer to manage journal entries.
 * Implementing classes are responsible for providing concrete implementations of data access operations.
 * This interface defines common methods for performing CRUD (Create, Read, Update, Delete) operations on journal entries.
 *
 * @author Zach McIntosh
 * @version 1.0
 * @since 2023-09-24
 */
public interface IJournalDAO {

    /**
     * Saves a new journal entry or updates an existing one.
     *
     * @param journalEntry The journal entry to save or update.
     * @return The saved or updated journal entry.
     */
    JournalEntry save (JournalEntry journalEntry);


    /**
     * Retrieves a list of all journal entries.
     *
     * @return A list of journal entries.
     */
    List<JournalEntry> fetchAll();
}
