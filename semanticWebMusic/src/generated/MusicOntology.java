/* CVS $Id: $ */
package generated; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from music_ontology.owl 
 * @author Auto-generated by schemagen on 24 Jun 2016 11:17 
 */
public class MusicOntology {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "https://sites.google.com/site/villanovasemanticweb/university.owl#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final ObjectProperty BelongsToGenre = m_model.createObjectProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#BelongsToGenre" );
    
    public static final ObjectProperty Perform = m_model.createObjectProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#Perform" );
    
    public static final DatatypeProperty GenreName = m_model.createDatatypeProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#GenreName" );
    
    public static final DatatypeProperty MusicartistName = m_model.createDatatypeProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#MusicartistName" );
    
    public static final DatatypeProperty ReleaseYear = m_model.createDatatypeProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#ReleaseYear" );
    
    public static final DatatypeProperty Tempo = m_model.createDatatypeProperty( "https://sites.google.com/site/villanovasemanticweb/university.owl#Tempo" );
    
    public static final OntClass Genre = m_model.createClass( "https://sites.google.com/site/villanovasemanticweb/university.owl#Genre" );
    
    public static final OntClass MusicArtist = m_model.createClass( "https://sites.google.com/site/villanovasemanticweb/university.owl#MusicArtist" );
    
    public static final OntClass Track = m_model.createClass( "https://sites.google.com/site/villanovasemanticweb/university.owl#Track" );
    
}