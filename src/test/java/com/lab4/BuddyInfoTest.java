package com.lab4;

import com.lab4.AddressBook;
import com.lab4.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BuddyInfoTest {

    /** Some assertions for lab 1 */
    @Test
    public void testGettersAndSetters() {
        /*
        BuddyInfo johnDoe = new BuddyInfo(1, new AddressBook(1), "John Doe", "101 John Doe Lane", "177-Doe-John");
        assertEquals("John Doe", johnDoe.getName());
        assertEquals("101 John Doe Lane", johnDoe.getAddress());
        assertEquals("177-Doe-John", johnDoe.getPhoneNumber());
        String newAddress = "New John Doe Address";
        johnDoe.setAddress(newAddress);
        assertEquals(newAddress, johnDoe.getAddress());
        */
        return;
    }

    /** Tests com.lab4.BuddyInfo persistence for lab 2 */
    @Test
    public void testPersistence() {
        /*
        BuddyInfo johnDoe = new BuddyInfo(1, new AddressBook(1), "John Doe", "101 John Doe Lane", "177-Doe-John");
        BuddyInfo janeDoe = new BuddyInfo(2, new AddressBook(2), "Jane Doe", "202 Jane Doe Lane", "277-Doe-Jane");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("addressBook");
        EntityManager em;
        em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(johnDoe);
        em.persist(janeDoe);
        tx.commit();

        Query q = em.createQuery("SELECT b FROM BuddyInfo b");
        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of persisted com.lab4.BuddyInfo objects:");
        for (BuddyInfo b : results) {
            System.out.println("com.lab4.BuddyInfo{" +
                    "id=" + b.getId() +
                    ", addressBookId=" + b.getAddressBook().getId() +
                    ", name='" + b.getName() + '\'' +
                    ", address='" + b.getAddress() + '\'' +
                    ", phoneNumber='" + b.getPhoneNumber() + '\'' +
                    '}');
        }

        em.close();
        emf.close();
        */
        return;
    }

}