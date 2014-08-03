/**
 * This class is generated by jOOQ
 */
package com.intechua.db.jooq;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.intechua.db.jooq.tables.records.JournalRecord, java.lang.Integer> IDENTITY_JOURNAL = Identities0.IDENTITY_JOURNAL;
	public static final org.jooq.Identity<com.intechua.db.jooq.tables.records.OperatorRecord, java.lang.Integer> IDENTITY_OPERATOR = Identities0.IDENTITY_OPERATOR;
	public static final org.jooq.Identity<com.intechua.db.jooq.tables.records.PacketsRecord, java.lang.Integer> IDENTITY_PACKETS = Identities0.IDENTITY_PACKETS;
	public static final org.jooq.Identity<com.intechua.db.jooq.tables.records.SampleTableRecord, java.lang.Integer> IDENTITY_SAMPLE_TABLE = Identities0.IDENTITY_SAMPLE_TABLE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.JournalRecord> SYS_PK_10100 = UniqueKeys0.SYS_PK_10100;
	public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.OperatorRecord> SYS_PK_10103 = UniqueKeys0.SYS_PK_10103;
	public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.PacketsRecord> SYS_PK_10096 = UniqueKeys0.SYS_PK_10096;
	public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.SampleTableRecord> SYS_PK_10092 = UniqueKeys0.SYS_PK_10092;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.intechua.db.jooq.tables.records.JournalRecord, java.lang.Integer> IDENTITY_JOURNAL = createIdentity(com.intechua.db.jooq.tables.Journal.JOURNAL, com.intechua.db.jooq.tables.Journal.JOURNAL.ID);
		public static org.jooq.Identity<com.intechua.db.jooq.tables.records.OperatorRecord, java.lang.Integer> IDENTITY_OPERATOR = createIdentity(com.intechua.db.jooq.tables.Operator.OPERATOR, com.intechua.db.jooq.tables.Operator.OPERATOR.ID);
		public static org.jooq.Identity<com.intechua.db.jooq.tables.records.PacketsRecord, java.lang.Integer> IDENTITY_PACKETS = createIdentity(com.intechua.db.jooq.tables.Packets.PACKETS, com.intechua.db.jooq.tables.Packets.PACKETS.ID);
		public static org.jooq.Identity<com.intechua.db.jooq.tables.records.SampleTableRecord, java.lang.Integer> IDENTITY_SAMPLE_TABLE = createIdentity(com.intechua.db.jooq.tables.SampleTable.SAMPLE_TABLE, com.intechua.db.jooq.tables.SampleTable.SAMPLE_TABLE.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.JournalRecord> SYS_PK_10100 = createUniqueKey(com.intechua.db.jooq.tables.Journal.JOURNAL, com.intechua.db.jooq.tables.Journal.JOURNAL.ID);
		public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.OperatorRecord> SYS_PK_10103 = createUniqueKey(com.intechua.db.jooq.tables.Operator.OPERATOR, com.intechua.db.jooq.tables.Operator.OPERATOR.ID);
		public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.PacketsRecord> SYS_PK_10096 = createUniqueKey(com.intechua.db.jooq.tables.Packets.PACKETS, com.intechua.db.jooq.tables.Packets.PACKETS.ID);
		public static final org.jooq.UniqueKey<com.intechua.db.jooq.tables.records.SampleTableRecord> SYS_PK_10092 = createUniqueKey(com.intechua.db.jooq.tables.SampleTable.SAMPLE_TABLE, com.intechua.db.jooq.tables.SampleTable.SAMPLE_TABLE.ID);
	}
}
