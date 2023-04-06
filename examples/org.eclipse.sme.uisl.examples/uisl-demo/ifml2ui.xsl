<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  
xmlns:myNS="http://devedge.netscape.com/2002/de" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
                <link rel="stylesheet" href="style.scss"></link>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"></link>
                <title>DSL_GUI</title>
            </head>
            <body>
                <h1>My project</h1>
                

                <!-- <xsl:for-each select="//interactionFlowModelElement[@isDefault='true']">
                    <xsl:call-template name="pageDefault"/>
                </xsl:for-each> -->
                    <!-- <xsl:choose>
                        <xsl:when test="//interactionFlowModelElement[@xsi:type='pos_v3:ViewContainer']">
                            <xsl:when test="//interactionFlowModelElement[@isDefault='true']">
                                <xsl:call-template name="pageDefault"/>
                            </xsl:when>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:call-template name="pageHidden"/>
                        </xsl:otherwise>
                    </xsl:choose> -->

                <xsl:for-each select="//interactionFlowModelElement[@xsi:type='pos_v3:ViewContainer']">
                    <xsl:call-template name="pageHidden"/>
                </xsl:for-each>

                <!-- <xsl:apply-templates></xsl:apply-templates> -->

                <!-- <div class="v-card">
                    <div class="v-card-text">
                        <div>Title</div>
                    </div>
                    <div class="v-card-content">
                        <div>Content</div>
                        <div class="form-outline">
                            <input type="text" id="form12" class="form-control" />
                            <label class="form-label" for="form12">Example label</label>
                        </div>
                        <button type="button" class="v-btn">
                            <span class="v-btn-content"> Button content</span>
                        </button>
                    </div>
                </div>

                <div class="v-card">
                    <div class="v-card-text">
                        <span>Callout Header</span>
                        <span class="closebtn" onclick="this.parentElement.style.display='none';">x</span></div>
                    <div class="v-card-content">
                        <p>Some text to describe the callout message.</p>
                    </div>
                </div> -->
                <!-- <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item active" aria-current="page">Home</li>
                    </ol>
                </nav>

                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Library</li>
                    </ol>
                </nav>

                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item"><a href="#">Library</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Data</li>
                    </ol>
                </nav> -->

                <!-- <button type="button" class="v-btn" click="createNewpage()">
                <span class="v-btn-content">
                    <xsl:value-of select="@name"></xsl:value-of>
                </span>
            </button> -->

            </body>
            <script src="myscript.js"></script>
        </html>
    </xsl:template>

    <xsl:template name="pageDefault" match="interactionFlowModelElement[@isDefault='true']">
        <html>
            <body class="defaultPage" id="defaultPage">
                <div class="v-card">
                    <div class="v-card-text">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item active" aria-current="page">
                                    <xsl:value-of select="@name"></xsl:value-of>
                                </li>
                            </ol>
                        </nav>
                    </div>
                    <div class="v-card-content">
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:FormComponent']">
                            <xsl:call-template name="chooseFormComponent"/>
                        </xsl:for-each>
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:ListComponent']">
                            <xsl:call-template name="chooseListComponent"/>
                        </xsl:for-each>
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:MessageComponent']">
                            <xsl:call-template name="chooseMessageComponent"/>
                        </xsl:for-each>
                        
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template name="pageHidden" match="interactionFlowModelElement[@xsi:type='pos_v3:ViewContainer']">
        <html>
            <body class="hiddenPage" id="hiddenPage">
                <div class="v-card">
                    <div class="v-card-text">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item active" aria-current="page">
                                    <xsl:value-of select="@name"></xsl:value-of>
                                </li>
                            </ol>
                        </nav>
                    </div>
                    <div class="v-card-content">
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:FormComponent']">
                            <xsl:call-template name="chooseFormComponent"/>
                        </xsl:for-each>
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:ListComponent']">
                            <xsl:call-template name="chooseListComponent"/>
                        </xsl:for-each>
                        <xsl:for-each select="child::viewElement[@xsi:type='pos_v3:MessageComponent']">
                            <xsl:call-template name="chooseMessageComponent"/>
                        </xsl:for-each>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template  name="chooseFormComponent" match="interactionFlowModelElement/viewElement[@xsi:type='pos_v3:FormComponent']">
        <div class="displayHidden">
            <div class="v-card">
                <div class="v-card-text">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item active" aria-current="page">
                                <xsl:value-of select="@name"></xsl:value-of>
                            </li>
                        </ol>
                    </nav>
                </div>
                <div class="v-card-content">
                    <form>
                        <div class="form-group">
                            <input type="text" class="form-control" id="id" aria-describedby="id" placeholder="Id"></input>
                            <input type="text" class="form-control" id="name" aria-describedby="name" placeholder="Name"></input>
                        </div>
                    </form>

                    <xsl:for-each select="child::*">
                        <button type="button" class="v-btn" click="createNewpage()">
                            <span class="v-btn-content">
                                <xsl:value-of select="../@name"></xsl:value-of>
                            </span>
                        </button>
                    </xsl:for-each>
                </div>
            </div>

        </div>
    </xsl:template>

    <xsl:template name="chooseListComponent" match="interactionFlowModelElement/viewElement[@xsi:type='pos_v3:ListComponent']">
        <div class="v-card">
            <div class="v-card-text">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item active" aria-current="page">
                            <xsl:value-of select="@name"></xsl:value-of>
                        </li>
                    </ol>
                </nav>
            </div>
            <div class="v-card-content">
                <table>
                    <tr>
                        <th>Company</th>
                        <th>Contact</th>
                        <th>Country</th>
                    </tr>
                    <tr>
                        <td>Alfreds Futterkiste</td>
                        <td>Maria Anders</td>
                        <td>Germany</td>
                    </tr>
                    <tr>
                        <td>Alfreds Futterkiste</td>
                        <td>Maria Anders</td>
                        <td>Germany</td>
                    </tr>
                </table>
            </div>
        </div>
    </xsl:template>

    <xsl:template name="chooseMessageComponent" match="interactionFlowModelElement/viewElement[@xsi:type='pos_v3:MessageComponent']">
        <div class="v-card-content">
            <div>This is message</div>
        </div>
        <xsl:for-each select="child::*">
                <button type="button" class="v-btn" click="createNewpage()">
                    <span class="v-btn-content">
                        Back
                    </span>
                </button>
            </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>