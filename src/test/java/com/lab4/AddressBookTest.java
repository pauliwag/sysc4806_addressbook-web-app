package com.lab4;

import com.lab4.AddressBook;
import com.lab4.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    /** Some assertions for lab 1 */
    @Test
    public void testBuddies() {
        /*
        AddressBook addressBook = new AddressBook(1);
        ArrayList<BuddyInfo> buddies = new ArrayList<>();
        BuddyInfo johnDoe = new BuddyInfo(1, addressBook, "John Doe", "101 John Doe Lane", "177-Doe-John");
        BuddyInfo janeDoe = new BuddyInfo(2, addressBook, "Jane Doe", "202 Jane Doe Lane", "277-Doe-Jane");
        buddies.add(johnDoe);
        buddies.add(janeDoe);
        addressBook.setBuddies(buddies);
        assert addressBook.getBuddies().contains(johnDoe);
        assert addressBook.getBuddies().contains(janeDoe);
        buddies.remove(johnDoe);
        assert !addressBook.getBuddies().contains(johnDoe);
        */
        return;
    }

    /** Tests com.lab4.AddressBook persistence for lab 2 */
    @Test
    public void testPersistence() {
        /*
        AddressBook addressBook = new AddressBook();
        ArrayList<BuddyInfo> buddies = new ArrayList<>();
        buddies.add(new BuddyInfo(1, addressBook, "John Doe", "101 John Doe Lane", "177-Doe-John"));
        buddies.add(new BuddyInfo(2, addressBook, "Jane Doe", "202 Jane Doe Lane", "277-Doe-Jane"));
        addressBook.setId(1);
        addressBook.setBuddies(buddies);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("addressBook");
        EntityManager em;
        em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(addressBook);
        tx.commit();

        Query q = em.createQuery("SELECT a FROM AddressBook a");
        @SuppressWarnings("unchecked")
        List<AddressBook> results = q.getResultList();

        System.out.println("List of persisted com.lab4.AddressBook objects:");
        for (AddressBook a : results) {
            String buddiesStr = "";
            for (BuddyInfo b : a.getBuddies()) {
                buddiesStr += "\ncom.lab4.BuddyInfo{" +
                        "id=" + b.getId() +
                        ", addressBookId=" + b.getAddressBook().getId() +
                        ", name='" + b.getName() + '\'' +
                        ", address='" + b.getAddress() + '\'' +
                        ", phoneNumber='" + b.getPhoneNumber() + '\'' +
                        '}';
            }
            System.out.println("com.lab4.AddressBook{" +
                    "id=" + a.getId() +
                    ", buddies=[" + buddiesStr +
                    "]}");
        }

        em.close();
        emf.close();
        */
        return;
    }

}