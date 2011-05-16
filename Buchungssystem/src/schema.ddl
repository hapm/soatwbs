
    create table Bill (
        billId integer not null,
        author varchar(255),
        billNr integer not null,
        date date,
        reciever varchar(255),
        primary key (billId)
    );

    create table BillPosition (
        positionId integer not null,
        amount double precision not null,
        articleNr integer not null,
        description varchar(255),
        posNum integer not null,
        quantity integer not null,
        bill integer,
        primary key (positionId)
    );

    create table Invoice (
        invoiceId integer not null,
        author varchar(255),
        date date,
        invoiceNr integer not null,
        reciever varchar(255),
        primary key (invoiceId)
    );

    create table InvoicePosition (
        positionId integer not null,
        articleNr integer not null,
        description varchar(255),
        posNum integer not null,
        quantity integer not null,
        weight double precision not null,
        invoice_invoiceId integer,
        primary key (positionId)
    );

    create table Invoice_InvoicePosition (
        Invoice_invoiceId integer not null,
        positions_positionId integer not null,
        primary key (Invoice_invoiceId, positions_positionId),
        unique (positions_positionId)
    );

    create table Relation (
        relationId integer not null,
        creator varchar(255),
        doubleChecker varchar(255),
        status integer,
        timestamp datetime,
        bill_billId integer,
        invoice_invoiceId integer,
        primary key (relationId)
    );

    alter table BillPosition 
        add index FKD9E17E7039B88CF (bill), 
        add constraint FKD9E17E7039B88CF 
        foreign key (bill) 
        references Bill (billId);

    alter table InvoicePosition 
        add index FK2CEA7B567A8BE142 (invoice_invoiceId), 
        add constraint FK2CEA7B567A8BE142 
        foreign key (invoice_invoiceId) 
        references Invoice (invoiceId);

    alter table Invoice_InvoicePosition 
        add index FK47A4F224D96BF30E (positions_positionId), 
        add constraint FK47A4F224D96BF30E 
        foreign key (positions_positionId) 
        references InvoicePosition (positionId);

    alter table Invoice_InvoicePosition 
        add index FK47A4F2247A8BE142 (Invoice_invoiceId), 
        add constraint FK47A4F2247A8BE142 
        foreign key (Invoice_invoiceId) 
        references Invoice (invoiceId);

    alter table Relation 
        add index FKE2CE5E1CE39C4362 (bill_billId), 
        add constraint FKE2CE5E1CE39C4362 
        foreign key (bill_billId) 
        references Bill (billId);

    alter table Relation 
        add index FKE2CE5E1C7A8BE142 (invoice_invoiceId), 
        add constraint FKE2CE5E1C7A8BE142 
        foreign key (invoice_invoiceId) 
        references Invoice (invoiceId);
