package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/**
 * Represents a journal entry in the application.
 *
 * <p>
 * The {@code JournalEntry} class is a data transfer object (DTO) that encapsulates information about a journal entry.
 * It includes fields for the journal ID, notes, and date of the entry.
 * </p>
 *
 * <p>
 * This class uses Lombok's {@link Data} annotation to automatically generate getter, setter, equals, hashCode, and toString methods for its fields.
 * </p>
 *
 * @author Zach McIntosh
 * @version 1.0
 * @since 2023-09-24
 */
public @Data class JournalEntry {
    private int JournalId;
    private String Notes;
    private String Date;
}
