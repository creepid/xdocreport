/**
 * Copyright (C) 2011-2012 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.apache.poi.xwpf.converter;

import java.io.IOException;

import org.junit.Test;

public abstract class AbstractXWPFPOIConverterTest
{

    @Test
    public void convertCV()
        throws IOException
    {
        doGenerate( "CV.docx" );
    }

    @Test
    public void generateCV2()
        throws IOException
    {
        doGenerate( "CV2.docx" );
    }

    @Test
    public void Docx4j_GettingStarted()
        throws IOException
    {
        doGenerate( "Docx4j_GettingStarted.docx" );
    }
    
    @Test
    public void DocxBig()
        throws IOException
    {
        doGenerate( "DocxBig.docx" );
    }

    @Test
    public void testDocxLettreRelance()
        throws IOException
    {
        doGenerate( "DocxLettreRelance.docx" );
    }

    @Test
    public void DocxStructures()
        throws IOException
    {
        doGenerate( "DocxStructures.docx" );
    }
    
    @Test
    public void Exercise1()
        throws IOException
    {
        doGenerate( "Exercise1.docx" );
    }

    @Test
    public void Exercise2()
        throws IOException
    {
        doGenerate( "Exercise2.docx" );
    }

    @Test
    public void Oriel()
        throws IOException
    {
        doGenerate( "Oriel.docx" );
    }

    @Test
    public void ooxml()
        throws IOException
    {
        doGenerate( "ooxml.docx" );
    }

    @Test
    public void SittingPretty()
        throws IOException
    {
        doGenerate( "SittingPretty.docx" );
    }

    @Test
    public void issue52()
        throws IOException
    {
        doGenerate( "Issue52.docx" );
    }

    @Test
    public void testTemplateGeneral()
        throws IOException
    {
        doGenerate( "TemplateGeneral.docx" );
    }

    @Test
    public void testTemplateIndividuel()
        throws IOException
    {
        doGenerate( "TemplateIndividuel.docx" );
    }

    @Test
    public void testChineseCharacters()
        throws IOException
    {
        doGenerate( "TestChineseCharacters.docx" );
    }

    @Test
    public void testColor()
        throws IOException
    {
        doGenerate( "TestColor.docx" );
    }

    @Test
    public void testColorAuto()
        throws IOException
    {
        doGenerate( "TestColorAuto.docx" );
    }

    @Test
    public void testComplexTable()
        throws IOException
    {
        doGenerate( "TestComplexTable.docx" );
    }

    @Test
    public void testFonts()
        throws IOException
    {
        doGenerate( "TestFonts.docx" );
    }

    @Test
    public void TestFontStylesBasedOn()
        throws IOException
    {
        doGenerate( "TestFontStylesBasedOn.docx" );
    }

    
    @Test
    public void testHeaderFooterPage()
        throws IOException
    {
        doGenerate( "TestHeaderFooterPage.docx" );
    }

    @Test
    public void testHeaderFooterPageFirstEvenDefault()
        throws IOException
    {
        doGenerate( "TestHeaderFooterPageFirstEvenDefault.docx" );
    }

    @Test
    public void testLandscapeFormat()
        throws IOException
    {
        doGenerate( "TestLandscapeFormat.docx" );
    }

    @Test
    public void testParagraphAlignment()
        throws IOException
    {
        doGenerate( "TestParagraphAlignment.docx" );
    }

    @Test
    public void testTable()
        throws IOException
    {
        doGenerate( "TestTable.docx" );
    }

    @Test
    public void testTableBorder()
        throws IOException
    {
        doGenerate( "TestTableBorder.docx" );
    }

    @Test
    public void testTestTableCellAlignment()
        throws IOException
    {
        doGenerate( "TestTableCellAlignment.docx" );
    }

    @Test
    public void testTestTableCellTextOrientation()
        throws IOException
    {
        doGenerate( "TestTableCellTextOrientation.docx" );
    }

    @Test
    public void testTitle()
        throws IOException
    {
        doGenerate( "TestTitle.docx" );
    }

    @Test
    public void convertPersAngaben()
        throws IOException
    {
        doGenerate( "PersAngaben.docx" );
    }

    protected abstract void doGenerate( String fileName )
        throws IOException;

}
