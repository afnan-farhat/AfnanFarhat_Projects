/*
  
 Test first deveplopment of all methods (all methods fails)
 
 */
package cpit251project;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class CPIT251ProjectIT {

    public CPIT251ProjectIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class Main.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        Main.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OwnerMenu method, of class Main.
     */
    @Test
    public void testOwnerMenu() {
        System.out.println("OwnerMenu");
        Main.OwnerMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OwnerOperation method, of class Main.
     */
    @Test
    public void testOwnerOperation() {
        System.out.println("OwnerOperation");
        Scanner in = null;
        int operationNum = 0;
        int NoFileIdea = 0;
        Ideas fileIdea = null;
        ArrayList<FileMangmant> fileManagment = null;
        Main.OwnerOperation(in, operationNum, NoFileIdea, fileIdea, fileManagment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InvestorOperation method, of class Main.
     */
    @Test
    public void testInvestorOperation() {
        System.out.println("InvestorOperation");
        Scanner in = null;
        Main.InvestorOperation(in);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InvestorMenu method, of class Main.
     */
    @Test
    public void testInvestorMenu() {
        System.out.println("InvestorMenu");
        Main.InvestorMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StaffMenu method, of class Main.
     */
    @Test
    public void testStaffMenu() {
        System.out.println("StaffMenu");
        Main.StaffMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubmitFileIdea method, of class Main.
     */
    @Test
    public void testSubmitFileIdea() {
        System.out.println("SubmitFileIdea");
        Scanner in = null;
        int NoFileIdea = 0;
        Ideas fileIdea = null;
        ArrayList<FileMangmant> fileManagment = null;
        Owner.SubmitFileIdea(in, NoFileIdea, fileIdea, fileManagment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteFileIdea method, of class Main.
     */
    @Test
    public void testDeleteFileIdea() {
        System.out.println("DeleteFileIdea");
        Scanner in = null;
        ArrayList<FileMangmant> fileManagment = null;
        Owner.DeleteFileIdea(in, fileManagment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddFavoriteIdea method, of class Main.
     */
    @Test
    public void testAddFavoriteIdea() {
        System.out.println("AddFavoriteIdea");
        Scanner in = null;
        Ideas fileIdeas = null;
        ArrayList<FileMangmant> fileManagment = null;
        Investor.AddFavoriteIdea(in, fileManagment, fileIdeas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Acceptance method, of class Main.
     */
    @Test
    public void testAcceptance() {
        System.out.println("Acceptance");
        int operationNum = 0;
        Scanner in = null;
        Ideas fileIdeas = null;
        ArrayList<FileMangmant> fileManagment = null;
        Staff.UpdateState(in, operationNum, fileIdeas, fileManagment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayIdeaFile method, of class Main.
     */
    @Test
    public void testDisplayIdeaFile() {
        System.out.println("DisplayIdeaFile");
        Scanner in = null;
        int expResult = 0;
        ArrayList<FileMangmant> fileManagment = null;
        int result = FileMangmant.DisplayIdeaFile(in, fileManagment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Quite method, of class Main.
     */
    @Test
    public void testQuite() {
        System.out.println("Quite");
        String job = "";
        FileMangmant.Quite(job);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeOnFile method, of class Main.
     */
    @Test
    public void testWriteOnFile() throws Exception {
        System.out.println("writeOnFile");
        ArrayList<FileMangmant> fileMangment = null;
        FileMangmant.writeOnFile(fileMangment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
